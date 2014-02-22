# add heroku remote ('herhue') 4 existing app ('boiling-eyrie-6843') and repo (some existing github maybe)
heroku git:remote -a boiling-eyrie-6843 -r herhue
# check dyno state
heroku ps -a boiling-eyrie-6843
# scale via dyno scaler
heroku ps:scale web+2
heroku ps:scale web=1
# show logs
heroku logs
# monitor heroku on an extra terminal
watch heroku ps
# restart dynos/heroku
heroku restart
# open the heroku application
heroku open
# Show currently used PaaS Stack
heroku stack
