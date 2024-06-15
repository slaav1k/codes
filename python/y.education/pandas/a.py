import pandas as pd

def length_stats(text):
    text = text.lower()
    text = "".join([word for word in text if word.isalpha() or word == " "])
    words = set(text.split())
    
    word_lengths = pd.Series([len(word) for word in words], index=words)
    word_lengths = word_lengths.sort_index()
    
    return word_lengths

print(length_stats('Лес, опушка, странный домик. Лес, опушка и зверушка.'))