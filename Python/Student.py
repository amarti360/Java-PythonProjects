import pandas as pd
from faker import Faker
import random

fake = Faker()

#generate random grades
def generate_grade():
    #return random.choice(['9', '10', '11', '12'])
    return random.randint(60,100)

def generate_phone_number():
    area_code = random.randint(111, 999)
    middle = random.randint(100, 999)
    last = random.randint(1000, 9999)
    return str(area_code) + "-" + str(middle) + "-"  + str(last)

def generate_phone_number2():
    phone_number = fake.phone_number()
    new_text = phone_number.replace("(", "")
    new_text2 = new_text.replace(")", "-")
    new_text3 = new_text2.replace(".", "-")
    if "-" not in new_text3:
        new_text4 = new_text3[:3] + "-" + new_text3[3:6] + "-" + new_text3[6:]
    else:
        new_text4 = new_text3
    return new_text4

def generate_address():
    street = fake.street_address()
    city = fake.city()
    state_abbr = fake.state_abbr()
    zipcode = fake.zipcode()
    return street + " " + city + ", " + state_abbr + " " + zipcode

data = []
num_rows = 100

for _ in range(num_rows):
    row = {
        'First name': fake.first_name(),
        'Last name': fake.last_name(),
        'Email': fake.email(),
       #'Address': fake.address(),
       'Address': generate_address(),
        #'Phone number': fake.phone_number(),
        #'Phone number': generate_phone_number(),
        'Phone number': generate_phone_number2(),
        'Grade': generate_grade()
    }
    data.append(row)

    df = pd.DataFrame(data)
    df.to_excel('StudentInfo.xlsx', index = False)
