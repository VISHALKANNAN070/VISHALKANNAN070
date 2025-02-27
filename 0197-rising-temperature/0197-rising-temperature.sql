# Write your MySQL query statement below
select day2.id from weather day1 ,weather day2
where day1.temperature < day2.temperature and datediff(day1.recorddate,day2.recorddate)=-1