-- 1. Display schedule of the movies for a given date. The result should be a table containing at least:

-- - movie title

-- - date and time when the show starts

-- - theater number where it is going to be played

-- - information on the number of ticket sold for each show

select Movie.title, show.starting_time, show.theater_id
from show join
    Movie on movie.movie_id = Show.movie_id

-- 2. Expand the previous one by adding information on the number of ticket sold for each show

select Movie.title, show.starting_time, show.theater_id, MyTable.[count]
from show join
    (select show_id, count(*) as [count]
    from ticket
    group by show_id) MyTable on show.show_id = MyTable.show_id
    join Movie on movie.movie_id = Show.movie_id

-- 3. Modify the previous one to display the number of available seats for each show, i.e. the difference between the number of seats in the theater where show is going to be played and the number of tickets already sold

select Movie.title, show.starting_time, show.theater_id, show.available_tickets, MyTable.[sold_tickets], (show.available_tickets - MyTable.[sold_tickets]) as remaining_tickets
from show join
    (select show_id, count(*) as [sold_tickets]
    from ticket
    group by show_id) MyTable on show.show_id = MyTable.show_id
    join Movie on movie.movie_id = Show.movie_id

-- 4. Display information about a ticket - assume person holds a ticket (knows ticket ID) and wants to get following information:

-- - when the show (for which ticket is valid) starts (date and time from SHOW table)

-- - in which theater the show plays (choose some columns from THEATER table)

-- - what will be the movie title played (title from MOVIE)

-- - what seat the ticket is valid for (row number and seat number from SEAT table)

select ticket.ticket_id, show.starting_time, show.theater_id, movie.title, seat.seat_row, seat.seat_column
from ticket join
    show on ticket.show_id = Show.show_id and ticket.ticket_id = 1
    join movie on movie.movie_id = show.movie_id
    join seat on seat.seat_id = ticket.seat_id

-- 5. Write an SELECT statement that given a ticket ID displays:

-- - theater information (columns of your choice from THEATER table) 

-- - ticket ID (from TICKET table)

select theater.theater_id, ticket.ticket_id
from ticket join
    show on ticket.show_id = show.show_id AND ticket.ticket_id = 1 JOIN
    theater on theater.theater_id = show.theater_id  

-- Display shows (id, date, time, movie title) that do no have tickets
select  show.show_id from show full outer join
ticket on show.show_id = ticket.show_id
group by show.show_id
having max(ticket.ticket_id) is null