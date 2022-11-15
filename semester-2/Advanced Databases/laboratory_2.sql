-- select * from movie, show;

-- select COUNT(*) from Movie;

-- select COUNT(*) from Show;

-- select * from Movie JOIN Show on Show.movie_id=Movie.movie_id;

-- slect * from movie, show WHERE show.movie=movie.movie_id;

-- select Movie.title, Show.starting_time, Theater.theater_id
-- from Movie, Theater, Show
-- where show.movie_id = Movie.movie_id AND show.theater_id = theater.theater_id

select Movie.title, show.starting_time, show.theater_id, MyTable.[count] from show join
(select show_id, count(*) as [count]
from ticket group by show_id) MyTable on show.show_id = MyTable.show_id
join Movie on movie.movie_id = Show.movie_id
-- select * from ticket
