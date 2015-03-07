(function() {
    var myApp = angular.module('flywayDemoApp', [
        'ngRoute',
        'app.controllers'
    ]);

    myApp.config(['$routeProvider', function($routeProvider) {

    	$routeProvider.when('/', {
    		templateUrl : 'Home',
    		controller : 'HomeCtrl'
    	});

    	$routeProvider.when('/details/:id', {
    		templateUrl : 'Details',
    		controller : 'DetailsCtrl'
    	});    	       
    	
    	$routeProvider.when('/favorites', {
    		templateUrl : 'Favorites',
    		controller : 'FavoritesCtrl'
    	});       	

        $routeProvider.otherwise({
            redirectTo: '/'
        });
        
    }]);
}());