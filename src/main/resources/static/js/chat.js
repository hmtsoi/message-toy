$(document).ready(function() {
  var msgUrl = "/v1/messages";
  $.ajax({
    url: msgUrl,
    success: function( result ) {
      result.messages.forEach(function(m) {
        $( "#message-list-wrapper" ).append( "<h4><font color=\"#D0D0D0\">" + m.senderName + "</font></h4>" );
        $( "#message-list-wrapper" ).append( "<h4>" + m.message + "</h5>" );
        $( "#message-list-wrapper" ).append( "<h4><font color=\"#D0D0D0\">" + m.messageTimestamp + "</font></h4>" );
      })
    }
  });

  $("#sendBtn").on("click", function() {
    var input = $( "#sendInput" ).val();
    $.ajax({
      type: "POST",
      url: msgUrl,
      dataType: 'json',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      data: JSON.stringify({ message: input}),
      success: function() {
        href: href
      },
    });
  })
})
