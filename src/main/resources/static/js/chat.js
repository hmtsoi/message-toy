$(document).ready(function() {
  $.ajax({
    url: "/v1/messages",
    success: function( result ) {
        console.log(result);
      result.messages.forEach(function(m) {
        $( "#message-list-wrapper" ).append( "<h4><font color=\"#D0D0D0\">" + m.senderName + "</font></h4>" );
        $( "#message-list-wrapper" ).append( "<h4>" + m.message + "</h5>" );
        $( "#message-list-wrapper" ).append( "<h4><font color=\"#D0D0D0\">" + m.messageTimestamp + "</font></h4>" );
      })
    }
  });
})