select * from air_ticket_info;

select distinct(profile_id) from air_ticket_info
where flight_id = (select count(flight_id) from air_ticket_info
group by profile_id
having count(flight_id)<=all(select count(flight_id) from 
air_ticket_info
group by profile_id));

select distinct(air_flight.flight_id), departure_time actual_departure_time, 
arrival_time actual_arrival_time, ADDTIME(departure_time,'01:00:00') delayed_departure_time, 
ADDTIME(arrival_time,'01:00:00') delayed_arrival_time
from air_flight,air_flight_details
where air_flight.flight_id=air_flight_details.flight_id
and flight_departure_date='2014-05-06';

select * from air_flight;

select count(flight_id) from air_flight
where from_location='chn'
and departure_time between '06:00:00' and '12:00:00'
and arrival_time between '12:00:00' and '18:00:00';

select flight_id,flight_departure_date,price,
case
when price<3000
then 'air passenger'
when price >3000 and price <4000
then 'air bus'
else
'executive passenger'
end
as 'flight_type'
from air_flight_details;

select air_flight.flight_id,from_location,to_location,price
from air_flight,air_flight_details
where air_flight.flight_id = air_flight_details.flight_id
and extract(month from date(flight_departure_date))=5;

select * from air_flight;

select air_flight.flight_id,from_location,to_location,flight_departure_date,duration
from air_flight,air_flight_details
where air_flight.flight_id = air_flight_details.flight_id
and duration< '01:10:00';

select * from air_credit_card_details;

select card_type, count(card_number) from air_credit_card_details
group by card_type;

select profile_id from air_ticket_info
group by profile_id
having
count(ticket_id) >= all (select count(ticket_id) from
air_ticket_info group by profile_id);

select * from air_ticket_info;

select distinct(air_passenger_profile.profile_id),first_name,mobile_number,email_id
from air_passenger_profile,air_ticket_info,air_flight
where air_passenger_profile.profile_id= air_ticket_info.profile_id
and air_flight.flight_id = air_ticket_info.flight_id
and from_location like 'hyd' and to_location like 'chn';

select * from air_passenger_profile;

select distinct(air_passenger_profile.profile_id),first_name,substring_index(substring_index(address,'-',-2),'-',1) base_location
,count(ticket_id) no_of_tickets
from air_ticket_info,air_passenger_profile
where air_ticket_info.profile_id = air_passenger_profile.profile_id
group by profile_id;
select * from air_flight_details;
select * from air_flight;
desc air_flight_details;

select distinct air_flight.flight_id,from_location,to_location, count(flight_departure_date) no_of_services
from air_flight,air_flight_details
where  air_flight.flight_id= air_flight_details.flight_id
and extract(month from flight_departure_date)=5
group by from_location,to_location;

select distinct(air_passenger_profile.profile_id),first_name,email_id,address,mobile_number
from air_passenger_profile,air_ticket_info
where air_passenger_profile.profile_id= air_ticket_info.profile_id 
and flight_id='3';

select * from air_ticket_info;


select distinct(air_flight.flight_id),from_location,to_location,sum(price) total_price, count(flight_departure_date) no_of_services
from air_flight,air_flight_details
where air_flight.flight_id= air_flight_details.flight_id
and extract(month from date(flight_departure_date))= '05'
group by flight_id
order by total_price desc;

select * from air_ticket_info;

select flight_id,flight_departure_date, count(profile_id) no_of_passengers
from air_ticket_info
group by flight_id,flight_departure_date;

select distinct(air_passenger_profile.profile_id),air_flight.flight_id, first_name,address,from_location
from air_passenger_profile,air_flight,air_ticket_info
where air_passenger_profile.profile_id= air_ticket_info.profile_id
and air_ticket_info.flight_id=air_flight.flight_id
and from_location<>address;

















