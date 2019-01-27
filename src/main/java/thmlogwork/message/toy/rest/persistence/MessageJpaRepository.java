package thmlogwork.message.toy.rest.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

interface MessageJpaRepository extends JpaRepository<MessageEntity, Integer> {
}
