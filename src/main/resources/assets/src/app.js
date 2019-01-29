/*
global ReactDOM
*/
function App() {
    return (
        <div>
            <Welcome name="Stranger"/>
        </div>
    );
}

let init = function () {
    ReactDOM.render(<App/>, document.getElementById('root'));
};