# SQL Ödev4
####
* Q1 - film tablosunda bulunan replacement_cost sütununda bulunan birbirinden farklı değerleri sıralayınız
####
* A1 - `SELECT DISTINCT replacement_cost FROM film;`
####
* Q2 - film tablosunda bulunan replacement_cost sütununda birbirinden farklı kaç tane veri vardır?
####
* A2 - `SELECT COUNT (DISTINCT replacement_cost) FROM film;`
####
* Q3 - film tablosunda bulunan film isimlerinde (title) kaç tanesini T karakteri ile başlar ve aynı zamanda rating 'G' ye eşittir?
####
* A3 - `SELECT COUNT (title) FROM film WHERE title LIKE 'T%' AND rating = 'G';`
####
* Q4 - country tablosunda bulunan ülke isimlerinden (country) kaç tanesi 5 karakterden oluşmaktadır?
####
* A4 - `SELECT COUNT (country) FROM country WHERE country LIKE '_____';`
####
* Q5 -city tablosundaki şehir isimlerinin kaç tanesi 'R' veya r karakteri ile biter?
####
* A5 - `SELECT COUNT (city) FROM city WHERE city ILIKE '%r';`