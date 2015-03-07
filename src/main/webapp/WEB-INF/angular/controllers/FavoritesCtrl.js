(function(){
	angular.module('app.controllers').controller('FavoritesCtrl', function($rootScope, $scope, $location, FavoriteResource, ContactResource) {
		$scope.contact = FavoriteResource.query({},function(data){
			$scope.favorites = data;
			$rootScope.title = "Favorites";
		}, function(err){
			$location.path("/");
		});
	});
})();