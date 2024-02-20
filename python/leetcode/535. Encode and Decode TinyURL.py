class Codec:
    def __init__(self) -> None:
        self.code = {}
        self.uncode = {}
        self.headURL = "http://tinyurl.com/"
        self.k = 0

    def encode(self, longUrl: str) -> str:
        if longUrl in self.code:
            return self.code[longUrl]
        shortURL = self.headURL + str(self.k)
        self.k += 1
        self.code[longUrl] = shortURL
        self.uncode[shortURL] = longUrl
        return shortURL

    def decode(self, shortUrl: str) -> str:
        return self.uncode[shortUrl]


# Your Codec object will be instantiated and called as such:
# codec = Codec()
# codec.decode(codec.encode(url))
