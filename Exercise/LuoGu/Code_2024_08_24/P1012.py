from functools import cmp_to_key
print(''.join(sorted([input(), input()][1].split(),
      key=cmp_to_key(lambda x, y: -1 if x+y > y+x else 1))))
