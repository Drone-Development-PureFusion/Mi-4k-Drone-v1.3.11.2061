.class public final Lcom/google/android/gms/games/social/SocialInviteRef;
.super Lcom/google/android/gms/common/data/j;

# interfaces
.implements Lcom/google/android/gms/games/social/SocialInvite;


# instance fields
.field private final c:Lcom/google/android/gms/games/Player;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/j;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    new-instance v0, Lcom/google/android/gms/games/PlayerRef;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/games/PlayerRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    iput-object v0, p0, Lcom/google/android/gms/games/social/SocialInviteRef;->c:Lcom/google/android/gms/games/Player;

    return-void
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/social/SocialInviteRef;->h()Lcom/google/android/gms/games/social/SocialInvite;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    const-string v0, "external_social_invite_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/social/SocialInviteRef;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/google/android/gms/games/Player;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/social/SocialInviteRef;->c:Lcom/google/android/gms/games/Player;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()I
    .locals 1

    const-string v0, "type"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/social/SocialInviteRef;->c(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {p0, p1}, Lcom/google/android/gms/games/social/SocialInviteEntity;->a(Lcom/google/android/gms/games/social/SocialInvite;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public f()I
    .locals 1

    const-string v0, "direction"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/social/SocialInviteRef;->c(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public g()J
    .locals 2

    const-string v0, "last_modified_timestamp"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/social/SocialInviteRef;->b(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public h()Lcom/google/android/gms/games/social/SocialInvite;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/social/SocialInviteEntity;

    invoke-direct {v0, p0}, Lcom/google/android/gms/games/social/SocialInviteEntity;-><init>(Lcom/google/android/gms/games/social/SocialInvite;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/social/SocialInviteEntity;->a(Lcom/google/android/gms/games/social/SocialInvite;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/social/SocialInviteEntity;->b(Lcom/google/android/gms/games/social/SocialInvite;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/social/SocialInviteRef;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/social/SocialInvite;

    check-cast v0, Lcom/google/android/gms/games/social/SocialInviteEntity;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/social/SocialInviteEntity;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
