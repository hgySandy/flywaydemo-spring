/**
 * 
 */
(function(){
	angular.module('app.controllers').controller('HomeCtrl', function($rootScope, $scope, ContactResource){
		$rootScope.title = "Home";
		$scope.contacts = ContactResource.query();
	});
})();