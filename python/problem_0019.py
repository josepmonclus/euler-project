
# Problem url: https://projecteuler.net/problem=19

from datetime import datetime
from dateutil.relativedelta import relativedelta

start = datetime(1901, 1, 1)
end = datetime(2000, 12, 31)

sundays = 0

work = start
while work < end:
    if work.weekday() == 6: # is sunday
        sundays += 1
    
    work = work + relativedelta(months=1)

print(sundays, 'sundays between', start, 'and', end)