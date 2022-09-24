import heapq
import sys
from collections import defaultdict

input = sys.stdin.readline


T = int(input())

for _ in range(T):
    max_heap = []
    min_heap = []
    hashmap = defaultdict(int)
    
    k = int(input())
    count = 0
    for __ in range(k):
        input_string = input().split(' ')
        command = input_string[0]
        number = int(input_string[1])
        
        if command == 'I':
            heapq.heappush(max_heap, -number)
            heapq.heappush(min_heap, number)
            hashmap[number] += 1
            count += 1
        else:
            if count == 0:
                continue
            if number == 1:
                max_num = -heapq.heappop(max_heap)
                while hashmap[max_num] == 0 and max_heap:
                    max_num = -heapq.heappop(max_heap)
                hashmap[max_num] -= 1
            elif number == -1:
                min_num = heapq.heappop(min_heap)
                while hashmap[min_num] == 0 and min_heap:
                    min_num = heapq.heappop(min_heap)
                hashmap[min_num] -= 1
            
            count -= 1
            if count == 0:
                max_heap = []
                min_heap = []
        
    if count == 0:
        print('EMPTY')
    else:
        max_num = -heapq.heappop(max_heap)
        while hashmap[max_num] == 0 and max_heap:
            max_num = -heapq.heappop(max_heap)
        min_num = heapq.heappop(min_heap)
        while hashmap[min_num] == 0 and min_heap:
            min_num = heapq.heappop(min_heap)
    
        print(f"{max_num} {min_num}")
