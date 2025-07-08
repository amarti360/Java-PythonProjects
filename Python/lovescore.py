def calculate_love_score():
    name1 = input("What is your name? ").lower()
    name2 = input("What is their name? ").lower()

    combined_names = name1 + name2

    true_count = 0
    for letter in "true":
        true_count += combined_names.count(letter)
    
    love_count = 0
    for letter in "love":
        love_count += combined_names.count(letter)
    
    love_score = int(str(true_count) + str(love_count))

    print(f"Your love score is {love_score}")

calculate_love_score()