/**
 * 
 */
(function(){
	angular.module('app.controllers').controller('HomeCtrl', function($rootScope, $scope, $location, ContactResource){
		$rootScope.title = "Flyway Demo Home";
		$scope.contacts = ContactResource.query({},
			function(data){
				console.log(data);
			});
		
		$scope.viewDetails = function(id){
			$location.path("/details/" + id);
		}
	});
})();