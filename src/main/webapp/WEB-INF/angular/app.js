(function() {
    var myApp = angular.module('flywayDemoApp', [
        'ngRoute',
        'app.controllers'
    ]);

    myApp.config(['$routeProvider', function($routeProvider) {

    	$routeProvider.when('/', {
    		templateUrl : 'Home',
    		controller : 'HomeCtrl',
    		css : 'resources/css/home.css'
    	});

    	$routeProvider.when('/details', {
    		templateUrl : 'Details',
    		controller : 'DetailssCtrl'
    	});    	       

        $routeProvider.otherwise({
            redirectTo: '/'
        });
        
    }]);
}());