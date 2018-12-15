class Main extends React.Component {

    constructor(props) {
        super(props);
    }

    render() {

        return (
            <div className="main">
                <Article title={"Java"} text={"Lorem ipsum dolo sit amet Lorem ipsum dolo sit amet"}/>
                <Article title={"React/JS"} text={"Lorem ipsum dolo sit amet Lorem ipsum dolo sit amet"}/>
                <Article title={"HTML/CSS"} text={"Lorem ipsum dolo sit amet Lorem ipsum dolo sit amet"}/>
            </div>
        );
    }
}