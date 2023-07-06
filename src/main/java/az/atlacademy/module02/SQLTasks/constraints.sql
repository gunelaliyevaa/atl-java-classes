create table music_library
(
    song_id        serial primary key,
    title          varchar(100),
    artist         varchar(100),
    album          varchar(100),
    genre          varchar(50),
    release_date   timestamp,
    release_status bool default true,
    song_credits   character varying(255) not null
);

INSERT INTO music_library (title, artist, album, genre, release_date, release_status, song_credits)
VALUES ('Bohemian Rhapsody', 'Queen', 'A Night at the Opera', 'Rock', '1975-10-31', true, 'idk 1'),
       ('Hotel California', 'Eagles', 'Hotel California', 'Rock', '1977-12-08', true, 'idk 2'),
       ('Smells Like Teen Spirit', 'Nirvana', 'Nevermind', 'Grunge', '1991-09-10', true, 'idk 3');
