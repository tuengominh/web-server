class Title extends React.Component {

    constructor(props) {
        super(props);
    }

    render() {

        let text = this.props.text;

        console.log(text);

        return <h1>this is the content</h1>;
    }
}