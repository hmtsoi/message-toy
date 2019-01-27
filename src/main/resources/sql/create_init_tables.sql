CREATE TABLE toy_message_db.user (
    id integer NOT NULL PRIMARY KEY,
    name character varying NOT NULL
)
CREATE TABLE toy_message_db.messages (
    id integer NOT NULL PRIMARY KEY,
    message text NOT NULL,
    sender_id integer NOT NULL,
    receiver_id integer NOT NULL,
    created_timestamp timestamp with time zone NOT NULL
)

GRANT ALL ON toy_message_db to toy_message_user ;
GRANT ALL ON toy_message_db."user" to toy_message_user ;