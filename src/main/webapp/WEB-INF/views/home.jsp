<div class="row">
	<div class="col-md-6">
	    <ul class="list-group">
	    	<li class="list-group-item" ng-repeat="c in contacts">
	    		<h4>{{c.name}} - {{c.phoneNumber}} <div class="btn btn-default" ng-click="viewDetails(c.id)">Details</div></h4>
	    	</li>
	    </ul>
	    <a class="btn btn-success" href="#/favorites">Favorites</a>
	</div>
</div>