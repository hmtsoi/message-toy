package thmlogwork.message.toy.rest.persistence;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMappings( {
        @SqlResultSetMapping(
                name = "MessageFetchResultEntity",
                classes = {
                        @ConstructorResult(
                                targetClass = MessageFetchResultEntity.class,
                                columns = {
                                        @ColumnResult( name = "id", type = Long.class ),
                                        @ColumnResult( name = "message", type = String.class ),
                                        @ColumnResult( name = "sender_id", type = Integer.class ),
                                        @ColumnResult( name = "sender_name", type = String.class ),
                                        @ColumnResult( name = "receiver_id", type = Integer.class ),
                                        @ColumnResult( name = "receiver_name", type = String.class ),
                                        @ColumnResult( name = "created_timestamp", type = Date.class )
                                }
                        )
                }

        ) }
)
@Entity
public class ResultMappings {
    @Id
    private Integer id;
}
