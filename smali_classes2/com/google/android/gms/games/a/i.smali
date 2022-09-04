.class public final Lcom/google/android/gms/games/a/i;
.super Lcom/google/android/gms/common/data/j;

# interfaces
.implements Lcom/google/android/gms/games/a/e;


# instance fields
.field private final c:Lcom/google/android/gms/games/PlayerRef;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/j;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    new-instance v0, Lcom/google/android/gms/games/PlayerRef;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/games/PlayerRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    iput-object v0, p0, Lcom/google/android/gms/games/a/i;->c:Lcom/google/android/gms/games/PlayerRef;

    return-void
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/a/i;->m()Lcom/google/android/gms/games/a/e;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/database/CharArrayBuffer;)V
    .locals 1

    const-string v0, "display_rank"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/a/i;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V

    return-void
.end method

.method public b(Landroid/database/CharArrayBuffer;)V
    .locals 1

    const-string v0, "display_score"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/a/i;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V

    return-void
.end method

.method public c()J
    .locals 2

    const-string v0, "rank"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/a/i;->b(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public c(Landroid/database/CharArrayBuffer;)V
    .locals 1

    const-string v0, "external_player_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/a/i;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "default_display_name"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/a/i;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/games/a/i;->c:Lcom/google/android/gms/games/PlayerRef;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/games/PlayerRef;->a(Landroid/database/CharArrayBuffer;)V

    goto :goto_0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "display_rank"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/a/i;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "display_score"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/a/i;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {p0, p1}, Lcom/google/android/gms/games/a/h;->a(Lcom/google/android/gms/games/a/e;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public f()J
    .locals 2

    const-string v0, "raw_score"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/a/i;->b(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public g()J
    .locals 2

    const-string v0, "achieved_timestamp"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/a/i;->b(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public getScoreHolderHiResImageUrl()Ljava/lang/String;
    .locals 1

    const-string v0, "external_player_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/a/i;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/games/a/i;->c:Lcom/google/android/gms/games/PlayerRef;

    invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerRef;->getHiResImageUrl()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getScoreHolderIconImageUrl()Ljava/lang/String;
    .locals 1

    const-string v0, "external_player_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/a/i;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "default_display_image_url"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/a/i;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/games/a/i;->c:Lcom/google/android/gms/games/PlayerRef;

    invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerRef;->getIconImageUrl()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "external_player_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/a/i;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "default_display_name"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/a/i;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/games/a/i;->c:Lcom/google/android/gms/games/PlayerRef;

    invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerRef;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/a/h;->a(Lcom/google/android/gms/games/a/e;)I

    move-result v0

    return v0
.end method

.method public i()Landroid/net/Uri;
    .locals 1

    const-string v0, "external_player_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/a/i;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "default_display_image_uri"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/a/i;->h(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/games/a/i;->c:Lcom/google/android/gms/games/PlayerRef;

    invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerRef;->i()Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method

.method public j()Landroid/net/Uri;
    .locals 1

    const-string v0, "external_player_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/a/i;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/games/a/i;->c:Lcom/google/android/gms/games/PlayerRef;

    invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerRef;->k()Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method

.method public k()Lcom/google/android/gms/games/Player;
    .locals 1

    const-string v0, "external_player_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/a/i;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/games/a/i;->c:Lcom/google/android/gms/games/PlayerRef;

    goto :goto_0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    const-string v0, "score_tag"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/a/i;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public m()Lcom/google/android/gms/games/a/e;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/a/h;

    invoke-direct {v0, p0}, Lcom/google/android/gms/games/a/h;-><init>(Lcom/google/android/gms/games/a/e;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/a/h;->b(Lcom/google/android/gms/games/a/e;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
