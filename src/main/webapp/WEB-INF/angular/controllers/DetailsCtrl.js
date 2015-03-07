(function(){
	angular.module('app.controllers').controller('DetailsCtrl', function($rootScope, $scope, $routeParams, $location, ContactResource) {
		$scope.contact = ContactResource.get({
			id : $routeParams.id
		}, function(data){
			$scope.contact = data;
			$rootScope.title = data.name + " Detatils";
		}, function(err){
			$location.path("/");
		});

	});
})();