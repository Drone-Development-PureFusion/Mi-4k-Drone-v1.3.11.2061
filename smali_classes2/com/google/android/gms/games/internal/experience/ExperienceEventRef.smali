.class public final Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;
.super Lcom/google/android/gms/common/data/j;

# interfaces
.implements Lcom/google/android/gms/games/internal/experience/ExperienceEvent;


# instance fields
.field private final c:Lcom/google/android/gms/games/GameRef;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 3

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/j;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    const-string v0, "external_game_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->c:Lcom/google/android/gms/games/GameRef;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/games/GameRef;

    iget-object v1, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->c_:Lcom/google/android/gms/common/data/DataHolder;

    iget v2, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->d_:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/games/GameRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->c:Lcom/google/android/gms/games/GameRef;

    goto :goto_0
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->m()Lcom/google/android/gms/games/internal/experience/ExperienceEvent;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    const-string v0, "external_experience_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/google/android/gms/games/Game;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->c:Lcom/google/android/gms/games/GameRef;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "display_title"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {p0, p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->a(Lcom/google/android/gms/games/internal/experience/ExperienceEvent;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    const-string v0, "display_description"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Landroid/net/Uri;
    .locals 1

    const-string v0, "icon_uri"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->h(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public getIconImageUrl()Ljava/lang/String;
    .locals 1

    const-string v0, "icon_url"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()J
    .locals 2

    const-string v0, "created_timestamp"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->b(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->a(Lcom/google/android/gms/games/internal/experience/ExperienceEvent;)I

    move-result v0

    return v0
.end method

.method public i()J
    .locals 2

    const-string v0, "xp_earned"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->b(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public j()J
    .locals 2

    const-string v0, "current_xp"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->b(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public k()I
    .locals 1

    const-string v0, "type"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->c(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public l()I
    .locals 1

    const-string v0, "newLevel"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->c(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public m()Lcom/google/android/gms/games/internal/experience/ExperienceEvent;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;

    invoke-direct {v0, p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;-><init>(Lcom/google/android/gms/games/internal/experience/ExperienceEvent;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->b(Lcom/google/android/gms/games/internal/experience/ExperienceEvent;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;

    check-cast v0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
