angular.module('demo', []).controller(
		'usersCtrl',
		function($scope, $http) {
			$http.get('http://localhost:3000/api/users').then(
					function(response) {
						$scope.users = response.data;
					});
			$scope.name = '';
			$scope.surname = '';
			$scope.id = '';
			$scope.edit = false;
			$scope.error = false;
			$scope.incomplete = false;
			$scope.editUser = function(user) {
					$scope.edit = true;
					$scope.id = user.id;
					$scope.fullName = user.fullName;
					$scope.email = user.email;
					$scope.companyName = user.companyName;
					$scope.employeeCount = user.employeeCount;
					$scope.description = user.description;
			};
			$scope.updateUser = function() {
				let obj = {
					fullName : $scope.fullName,
					email : $scope.email,
					companyName : $scope.companyName,
					employeeCount: $scope.employeeCount,
					description: $scope.description
				};
				
				$http.put(`http://localhost:3000/api/users/${$scope.id}`, obj, {
					headers : {
						'Content-Type' : 'application/json; charset=UTF-8'
					},
					'Accept' : 'application/json'
				}).then(function onSuccess(data) {
					window.alert(JSON.stringify(data.data));
					$http.get('http://localhost:3000/api/users').then(
							function(response) {
								$scope.users = response.data;
								$scope.email = null;
								$scope.fullName = null;
								$scope.companyName = null;
								$scope.employeeCount = null;
								$scope.description = null;
								$scope.id = null;
								$scope.edit = false;
							});
				}, function onError(err) {
					// do something on error
				});
			};
			$scope.cancelEdit = function() {
				$scope.email = null;
				$scope.fullName = null;
				$scope.companyName = null;
				$scope.employeeCount = null;
				$scope.description = null;
				$scope.id = null;
				$scope.edit = false;
			}
			$scope.addUser = function()  {
				if($scope.fullName && $scope.email && $scope.companyName && $scope.employeeCount  && $scope.description) {
					let obj = {
						fullName : $scope.fullName,
						email : $scope.email,
						companyName : $scope.companyName,
						employeeCount: $scope.employeeCount,
						description: $scope.description
					};
					
					$http.post('http://localhost:3000/api/users', obj, {
						headers : {
							'Content-Type' : 'application/json; charset=UTF-8'
						},
						'Accept' : 'application/json'
					}).then(function onSuccess(data) {
						window.alert(JSON.stringify(data.data));
						$http.get('http://localhost:3000/api/users').then(
								function(response) {
									$scope.users = response.data;
									$scope.email = null;
									$scope.fullName = null;
									$scope.companyName = null;
									$scope.employeeCount = null;
									$scope.description = null;
								});
					}, function onError(err) {
						// do something on error
					});
				}
				else {
					window.alert("Fill all inputs!")
				}
			};
			$scope.deleteUser = function(id) {

				
				$http.delete(`http://localhost:3000/api/users/${id}`,  {
					headers : {
						'Content-Type' : 'application/json; charset=UTF-8'
					},
					'Accept' : 'application/json'
				}).then(function onSuccess(data) {
					window.alert(JSON.stringify(data.data));
					$http.get('http://localhost:3000/api/users').then(
							function(response) {
								$scope.users = response.data;
								$scope.id = null;
							});
				}, function onError(err) {
					// do something on error
				});
			};
			$scope.$watch('rollNo', function() {
				$scope.test();
			});
			$scope.$watch('name', function() {
				$scope.test();
			});
			$scope.$watch('surname', function() {
				$scope.test();
			});

			$scope.test = function() {
				$scope.incomplete = false;
				if ($scope.edit
						&& (!$scope.name.length || !$scope.surname.length)) {
					$scope.incomplete = true;
				}
			};
		});