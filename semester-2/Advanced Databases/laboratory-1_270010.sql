CREATE TABLE Theater
(
    theater_id INT IDENTITY(1,1),
    capacity INT NOT NULL CHECK(capacity > 0),
);

CREATE TABLE Movie
(
    movie_id INT IDENTITY(1,1),
    duration INT NOT NULL CHECK(duration > 0 AND duration <= 999),
    title CHAR(1) NOT NULL,
);

CREATE TABLE Show
(
    show_id INT IDENTITY(1,1),
    movie_id INT NOT NULL,
    theater_id INT NOT NULL,
    starting_time DATETIME NOT NULL,
);

CREATE TABLE Seat
(
    seat_id INT IDENTITY(1,1),
    seat_row CHAR(1) NOT NULL,
    seat_column INT NOT NULL CHECK(seat_column > 0 AND seat_column <= 9),
    theater_id INT NOT NULL
);

CREATE TABLE Ticket
(
    ticket_id INT IDENTITY(1,1),
    seat_id INT NOT NULL,
    show_id INT NOT NULL,
    price INT NOT NULL CHECK(price > 0 AND price <= 999),
);