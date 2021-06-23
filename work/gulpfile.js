var gulp = require('gulp');
var inlinesource = require('gulp-inline-source');
 
gulp.task('inlinesource', function () {
	    return gulp.src('../kaputelefon/kaputelefon-frontend/src/*.html')
	        .pipe(inlinesource())
	        .pipe(gulp.dest('../kaputelefon/kaputelefon-frontend/target'));
});
