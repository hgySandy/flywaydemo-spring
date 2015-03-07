(function() {

    var restServices = angular.module('restservices', ['ngResource']);

    restServices.service('ContactResource', function($resource) {
        return $resource(_contextPath + "api/contact/:id");
    });
    
    restServices.service('FavoriteResource', function($resource) {
        return $resource(_contextPath + "api/favorite/:id");
    });

}());