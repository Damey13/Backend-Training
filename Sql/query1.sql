select * from dso where id = 1397
select * from doctor_practice_informations where id = 530;
select * from doctor_practice_map where id= 530;
select * from doctor_profiles where id = 432
select * from address_book where id = 432;
select * from treatments where doctor_practice_information_id =1;
select * from users;
select * from patients;

select
    dso.id as dso_id,
    dso.name as dso_name,
    dp.id as practice_id,
    dp.practice_name as practice_name,
    tr.doctor_user_id as doctor_id,
    concat(u2.first_name,' ',u2.last_name) as  doctor_name,
    u2.email as doctor_email,
    pa.user_id as patient_id, 
    concat(pa.first_name,' ',pa.middle_name,' ',pa.last_name) as  patient_name,
    u.email,
    concat(ab.street1,' ',ab.street2,' ',ab.city,' ',ab.postal_code,' ',ab.state) as  patient_primary_address,
    concat(ab2.street1,' ',ab2.street2,' ',ab2.city,' ',ab2.postal_code,' ',ab2.state) as  doctor_address
    
from patients pa
INNER JOIN users u
ON pa.user_id = u.id
INNER JOIN address_book ab
ON pa.user_id = ab.user_id
left join treatments tr
on tr.patient_id=pa.id
left join users u2
on u2.id=tr.doctor_user_id
left join address_book ab2
on ab2.user_id=tr.doctor_user_id
left join doctor_profiles
on doctor_profiles.doctor_user_id=tr.doctor_user_id
left join doctor_practice_informations dp
on dp.id=doctor_profiles.practice_id
left join dso
on dso.id=dp.dso_id
where ab.type='PRIMARY';


