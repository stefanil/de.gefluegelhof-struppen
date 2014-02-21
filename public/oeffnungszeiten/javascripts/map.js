var locations = [ 
    [ 	'<a style="vertical-align: top; display: block; background: url(\'../../assets/main/images/logo32_inverse.png\') left no-repeat transparent; padding: 0 0 0 50px;" href="http://localhost:9000/kontakt">'+	  	
		'<strong>Geflügelhof Struppen GmbH</strong><br/>'+
  		'OT Ebenheit Nr. 29a<br/>01796  Struppen'+
  		'</a>', 
  		50.94682, 13.98011, 1 ] 
]

function initialize() {

	var mapOptions = {
		center : new google.maps.LatLng(locations[0][1], locations[0][2]),
		zoom : 14,
		mapTypeControl : true,
		navigationControl : true,
		streetViewControl : true,
		mapTypeId : google.maps.MapTypeId.ROADMAP,
		backgroundColor : "#FFFFFF"
	};
	var map = new google.maps.Map(document.getElementById("map-canvas"), mapOptions);
	
	// Info Windows
	var infoWindowOptions = {
		maxWidth:	250	
	}
	
	var infowindow = new google.maps.InfoWindow(infoWindowOptions);
	var marker, i;
	for (i = 0; i < locations.length; i++) {
		marker = new google.maps.Marker(
				{
					position : new google.maps.LatLng(locations[i][1],
							locations[i][2]),
					map : map
				});

		google.maps.event.addListener(marker, 'click', (function(marker, i) {
			return function() {
				infowindow.setContent(locations[i][0]);
				infowindow.open(map, marker);
			}
		})(marker, i));
	}

}

// initialize after loading window
google.maps.event.addDomListener(window, 'load', initialize);