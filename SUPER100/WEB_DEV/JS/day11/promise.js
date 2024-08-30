// let pr = new Promise((resolve, reject) => {
//     let food = true;
//     if(food === true) {
//         resolve('food is available');
//     } else {
//         reject('food is not available');
//     }
// })
// console.log(pr);
// pr.then((res => console.log(res)));
// pr.catch((err => console.log(err)));



// let api = new
// {
//     "current_user_url": "https://api.github.com/user",
//     "current_user_authorizations_html_url": "https://github.com/settings/connections/applications{/client_id}",
//     "authorizations_url": "https://api.github.com/authorizations",
//     "code_search_url": "https://api.github.com/search/code?q={query}{&page,per_page,sort,order}",
//     "commit_search_url": "https://api.github.com/search/commits?q={query}{&page,per_page,sort,order}",
//     "emails_url": "https://api.github.com/user/emails",
//     "emojis_url": "https://api.github.com/emojis",
//     "events_url": "https://api.github.com/events",
//     "feeds_url": "https://api.github.com/feeds",
//     "followers_url": "https://api.github.com/user/followers",
//     "following_url": "https://api.github.com/user/following{/target}",
//     "gists_url": "https://api.github.com/gists{/gist_id}",
//     "hub_url": "https://api.github.com/hub",
//     "issue_search_url": "https://api.github.com/search/issues?q={query}{&page,per_page,sort,order}",
//     "issues_url": "https://api.github.com/issues",
//     "keys_url": "https://api.github.com/user/keys",
//     "label_search_url": "https://api.github.com/search/labels?q={query}&repository_id={repository_id}{&page,per_page}",
//     "notifications_url": "https://api.github.com/notifications",
//     "organization_url": "https://api.github.com/orgs/{org}",
//     "organization_repositories_url": "https://api.github.com/orgs/{org}/repos{?type,page,per_page,sort}",
//     "organization_teams_url": "https://api.github.com/orgs/{org}/teams",
//     "public_gists_url": "https://api.github.com/gists/public",
//     "rate_limit_url": "https://api.github.com/rate_limit",
//     "repository_url": "https://api.github.com/repos/{owner}/{repo}",
//     "repository_search_url": "https://api.github.com/search/repositories?q={query}{&page,per_page,sort,order}",
//     "current_user_repositories_url": "https://api.github.com/user/repos{?type,page,per_page,sort}",
//     "starred_url": "https://api.github.com/user/starred{/owner}{/repo}",
//     "starred_gists_url": "https://api.github.com/gists/starred",
//     "topic_search_url": "https://api.github.com/search/topics?q={query}{&page,per_page}",
//     "user_url": "https://api.github.com/users/{user}",
//     "user_organizations_url": "https://api.github.com/user/orgs",
//     "user_repositories_url": "https://api.github.com/users/{user}/repos{?type,page,per_page,sort}",
//     "user_search_url": "https://api.github.com/search/users?q={query}{&page,per_page,sort,order}"
// };
// console.log(g_api);


//fetch an api object
// let api = fetch("https://api.github.com")
// // console.log(api);
// //1st step
// //status code for valid api - 200
// //status code for invalid api - 40
// //2nd step body readable stream converted to json
// //3rd step then
// //-------------------------------//

// // let jsObjectNotation = api.then(res => {
// //     console.log(res);
// //     return res.json();
// // })
// // console.log(jsObjectNotation);
// // jsObjectNotation = jsObjectNotation.then(
// //     data => {
// //         console.log(data);
// //         return data;
// //     }
// // )
// api.then(response => {
//     if(response.ok) {
//         return response.json();
//     } else {
//         throw new Error("Invalid API");
//     }
// }).then(data => {
//     console.log(data);
// }).catch(error => {
//     console.error(error);
// });


// //------------------------------//
// let api2 = fetch("https://jsonplaceholder.typicode.com/users");

// api2.then(response => {
//     if(response.ok) {
//         return response.json();
//     } else {
//         throw new Error("Invalid API");
//     }
// }).then(data => {

//     //fetch object from api
//     console.log(data);

//     //fetch all the keys and all the names from the object
//     const keys = Object.keys(data);
//     console.log("Keys:", keys);
//     const values = Object.values(data);
//     console.log("Values:", values);

//     // Filter names containing 'e'
//     const filteredNames = values.filter(user => user.name.includes('e'));
//     console.log(filteredNames);

//     //print latitude and longitude of the filtered names
//     filteredNames.forEach(user => {
//         console.log(`${user.name}: Latitude: ${user.address.geo.lat}, Longitude: ${user.address.geo.lng}`);
//         console.log(user.name),
//         console.log(user.address.geo.lat),
//         console.log(user.address.geo.lng);
//     });

// }).catch(error => {
//     console.error(error);
// });


// filter whose rating is more than 4 then print the title of the filtered data
// let api3 = fetch("https://fakestoreapi.com/products");
// console.log(api3);

//
// let api4 = fetch("https://jsonplaceholder.typicode.com/posts");
// console.log(api4);
// console.log();

//
//remove the duplicates from the given object
let api5 = fetch("https://jsonplaceholder.typicode.com/albums")
// console.log(api5);
api5.then(response => {
    if(response.ok) {
        return response.json();
    } else {
        throw new Error("Invalid API");
    }
}).then(data => {
    //fetch object from api
    console.log(data);
    //remove duplicates from the albums array
    const uniqueAlbums = [...new Set(data.map(album => album.userId))].map(userId => data.filter(album => album.userId === userId));
    console.log(uniqueAlbums);
}).catch(error => {
    console.error(error);
});