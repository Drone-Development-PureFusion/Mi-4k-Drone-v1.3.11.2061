.class final Lcom/google/android/gms/games/internal/d$ep;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ail$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ep"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ail$c",
        "<",
        "Lcom/google/android/gms/games/social/a;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/games/social/SocialInvite;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/social/SocialInvite;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/d$ep;->a:Lcom/google/android/gms/games/social/SocialInvite;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/games/social/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ep;->a:Lcom/google/android/gms/games/social/SocialInvite;

    invoke-interface {p1, v0}, Lcom/google/android/gms/games/social/a;->b(Lcom/google/android/gms/games/social/SocialInvite;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/social/a;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/d$ep;->a(Lcom/google/android/gms/games/social/a;)V

    return-void
.end method
