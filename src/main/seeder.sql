USE europa_blog_db;
#
# # seed users
  insert into users (email, password, username) values ('user1','user1@gmail.com', 'letmein1');
  insert into users (email, password, username) values ('user2','user1@gmail.com', 'letmein2');
  insert into users (email, password, username) values ('user3','user1@gmail.com', 'letmein3');
  insert into users (email, password, username) values ('user4','user1@gmail.com', 'letmein4');
# ('bob@email.com', 'letmein', 'bob123');
#
#
# # seed posts
insert into posts (title, body, user_id) values ('Test Post Title 1', 'This is the body for test post 1', 1);
insert into posts (title, body, user_id) values ('Test Post Title 2', 'This is the body for test post 2', 2);
insert into posts (title, body, user_id) values ('Test Post Title 3', 'This is the body for test post 3', 3);
insert into posts (title, body, user_id) values ('Test Post Title 4', 'This is the body for test post 4', 4);
insert into posts (title, body, user_id) values ('Test Post Title 5', 'This is the body for test post 5', 1);


# ('Post 6', 'This is the test post 5 body.', 6);


# insert into posts (title, id, body) values ('Vehicle', 'jalopy');
# insert into ads (title, description) values ('4-wheeler', 'Clunker, fixer upper');
# insert into ads (title, description) values ('Monster Truck', 'Retired from Monster Jam looking to sell show stopper truck.');
# insert into ads (title, description) values ('Scalable', 'Cadillac prior owner pimp, might need to sanitize');
# insert into ads (title, description) values ('24 hour U', 'U services available.');
# insert into ads (title, description) values ('3rd generation', '1967 Mustang, passed down in the family and this vehicle has just outgrown me.');
# insert into ads (title, description) values ('Toyota', 'Toyota Corolla 10,000 miles new brakes and oil change.');
# insert into ads (title, description) values ('Hummer', '4-wheel drive.');

