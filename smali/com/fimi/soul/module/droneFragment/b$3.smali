.class Lcom/fimi/soul/module/droneFragment/b$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/media/player/IMediaPlayer$OnInfoListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/droneFragment/b;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/droneFragment/b;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/droneFragment/b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/b$3;->a:Lcom/fimi/soul/module/droneFragment/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInfo(Lcom/fimi/soul/media/player/IMediaPlayer;II)Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b$3;->a:Lcom/fimi/soul/module/droneFragment/b;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/b;->c(Lcom/fimi/soul/module/droneFragment/b;)Lcom/fimi/soul/media/player/widget/FimiVideoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->toggleAspectRatio()I

    const/4 v0, 0x0

    return v0
.end method
