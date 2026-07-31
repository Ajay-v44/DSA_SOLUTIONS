def minimumPushes(self, word):
        frequency={}

        for ch in word:
            frequency[ch]=frequency.get(ch,0)+1

        sorted_freq=sorted(frequency.values(),reverse=True)
        max_count=0
        count=0
        mult=1
        for value in sorted_freq:
            if count>=8:
                count=0
                mult+=1
            count+=1
            max_count+=value*mult
        return max_count