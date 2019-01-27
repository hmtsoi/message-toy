INSERT into toy_message_users (name) VALUES ('test user 001');
INSERT into messages (message, sender_id, sender_name, receiver_id, created_timestamp)
VALUES ('test msg', 1,'test user 001', 1, now() );