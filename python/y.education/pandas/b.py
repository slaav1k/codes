import pandas as pd


def length_stats(text):
    text = text.lower()
    text = "".join([word for word in text if word.isalpha() or word == " "])
    words = set(text.split())
    odd_words = []
    even_words = []
    for i in words:
        if len(i) % 2 != 0:
            odd_words.append(i)
        else:
            even_words.append(i)
    
    odd_word_lengths = pd.Series([len(word) for word in odd_words], index=odd_words, dtype='int64')
    odd_word_lengths = odd_word_lengths.sort_index()
    
    even_word_lengths = pd.Series([len(word) for word in even_words], index=even_words, dtype='int64')
    even_word_lengths = even_word_lengths.sort_index()
    
    return odd_word_lengths, even_word_lengths

odd, even = length_stats('Лес, опушка, странный домик. Лес, опушка и зверушка.')
print(odd)
print(even)