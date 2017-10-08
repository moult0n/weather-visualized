const watch = require('watch');
const { spawnSync } = require('child_process');
const fs = require('fs-extra');

watch.watchTree('src/main/js/app', () => {
    console.log(spawnSync('npm', ['run', 'build']).stdout.toString());
    fs.copy('src/main/resources/static', 'build/resources/main/static', (err) => {
        if (err) return console.error(err)
    })
});
