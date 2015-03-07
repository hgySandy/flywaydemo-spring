(function(){
	angular.module('app.controllers').controller('MainCtrl', function($rootScope, $scope, $location, ContactResource) {
		$scope.contact = ContactResource.getById({
			id : $routeParams.id
		}, function(response){
			$scope.contact = response.data;
			$rootScope.title = response.data.name + " Detatils";
		}, function(err){
			$location.path("/");
		});

	});
})();