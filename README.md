## Java API For Sleeper Fantasy Football
This is a Java adapter to use the Sleeper API. As it currently stands,
it is incomplete, does not error check, and most likely has some poor
choices when it comes to architecture. It is built to adhere to
object-oriented principles and to take data straight from the API and
translate it into easily-accessible POJOs.

### Official Documentation for Sleeper API
`https://docs.sleeper.app/`

The client is grouped the same way it is on the API site.
Current groups are: Users, Leagues, Drafts, and Players. Stats has
yet to be implemented.

### Simple Documentation of current functionality

##### To get a new instance of the API client
`Sleeper sleeper = new SleeperApi();`

##### Example usage for each group
`User user = sleeper.users().getByUsername({username});`

`List<League> leagues = sleeper.leagues().getAllLeaguesForUserBySeason({userId}, {season_year});`

`List<Draft> drafts = sleeper.drafts().getAllDraftsForUser({user_id}, {season_year});`

###### Warning: The folks over at sleeper ask that you use this call sparingly, as it is intended to only be used once per day at most to keep your player IDs updated. The average size of this query is 5mb.
`List<Player> players = sleeper.players().getAllPlayers();`


Please see the javadoc for more usages.

### Contributing

Place pull requests if you please, or just leave issues on the tracker and I'll get to them when I can.
But please understand this is not fully implemented or tested yet. If I have missed any fields for an object,
also please put that in the issue tracker. Thank you!


