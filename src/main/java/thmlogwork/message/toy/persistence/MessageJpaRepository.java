package thmlogwork.message.toy.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

interface MessageJpaRepository extends JpaRepository<MessageEntity, Integer> {

    @Query( "SELECT m from MessageEntity m WHERE m.receiverId = :userId" )
    List<MessageEntity> getMessagesForUser( @Param( "userId" ) Integer userId );
}
