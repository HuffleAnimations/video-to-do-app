const seeHome = 'http://192.168.0.105:8080/video/';
const huffleHome = 'http://192.168.1.200:8080/video/';

export default class VideoService {
  getIdeas() {
    return fetch(seeHome + 'ideas')
      .then((response) => response.json())
      .then((json) => {
        return json;
      })
      .catch((error) => {
        console.log(error);
      });
  }

  getDone() {
    return fetch(seeHome + 'done')
      .then((response) => response.json())
      .then((json) => {
        return json;
      })
      .catch((error) => {
        console.log(error);
      });
  }

  createIdea(title, totalFrames) {
    return fetch(seeHome + 'ideas', {
      method: 'POST',
      headers: {
        Accept: 'application/json',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({
        title: title,
        totalFrames: totalFrames
      })
    })
    .then(response => {
      if (response.ok) {
        return response.json();
      } else {
        return response.json()
        .then(error => {
          throw new Error(error.message);
        })
      }
    })
  }
}
