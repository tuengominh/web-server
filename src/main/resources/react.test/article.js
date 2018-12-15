class Article extends React.Component {

    constructor(props) {
        super(props);
    }

    render() {

        let h1Class = "";

        if (this.props.important) {
            h1Class = "important";
        }

        return (
            <div className="article">

            <h1 className={h1Class}>{this.props.title}</h1>
            <p>{this.props.text}</p>

            </div>
        );
    }
}