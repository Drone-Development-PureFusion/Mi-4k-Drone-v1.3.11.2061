.class public final Lcom/google/android/gms/games/GameEntity;
.super Lcom/google/android/gms/games/internal/GamesDowngradeableSafeParcel;

# interfaces
.implements Lcom/google/android/gms/games/Game;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/GameEntity$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/games/GameEntity;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Landroid/net/Uri;

.field private final i:Landroid/net/Uri;

.field private final j:Landroid/net/Uri;

.field private final k:Z

.field private final l:Z

.field private final m:Ljava/lang/String;

.field private final n:I

.field private final o:I

.field private final p:I

.field private final q:Z

.field private final r:Z

.field private final s:Ljava/lang/String;

.field private final t:Ljava/lang/String;

.field private final u:Ljava/lang/String;

.field private final v:Z

.field private final w:Z

.field private final x:Z

.field private final y:Ljava/lang/String;

.field private final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/GameEntity$a;

    invoke-direct {v0}, Lcom/google/android/gms/games/GameEntity$a;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/GameEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;ZZLjava/lang/String;IIIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Z)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/GamesDowngradeableSafeParcel;-><init>()V

    iput p1, p0, Lcom/google/android/gms/games/GameEntity;->a:I

    iput-object p2, p0, Lcom/google/android/gms/games/GameEntity;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/games/GameEntity;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/games/GameEntity;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/games/GameEntity;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/games/GameEntity;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/games/GameEntity;->g:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/games/GameEntity;->h:Landroid/net/Uri;

    move-object/from16 v0, p19

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->s:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/games/GameEntity;->i:Landroid/net/Uri;

    move-object/from16 v0, p20

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->t:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/games/GameEntity;->j:Landroid/net/Uri;

    move-object/from16 v0, p21

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->u:Ljava/lang/String;

    iput-boolean p11, p0, Lcom/google/android/gms/games/GameEntity;->k:Z

    iput-boolean p12, p0, Lcom/google/android/gms/games/GameEntity;->l:Z

    iput-object p13, p0, Lcom/google/android/gms/games/GameEntity;->m:Ljava/lang/String;

    iput p14, p0, Lcom/google/android/gms/games/GameEntity;->n:I

    move/from16 v0, p15

    iput v0, p0, Lcom/google/android/gms/games/GameEntity;->o:I

    move/from16 v0, p16

    iput v0, p0, Lcom/google/android/gms/games/GameEntity;->p:I

    move/from16 v0, p17

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->q:Z

    move/from16 v0, p18

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->r:Z

    move/from16 v0, p22

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->v:Z

    move/from16 v0, p23

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->w:Z

    move/from16 v0, p24

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->x:Z

    move-object/from16 v0, p25

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->y:Ljava/lang/String;

    move/from16 v0, p26

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->z:Z

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/games/Game;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/GamesDowngradeableSafeParcel;-><init>()V

    const/4 v0, 0x7

    iput v0, p0, Lcom/google/android/gms/games/GameEntity;->a:I

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->b:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->d:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->e:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->f:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->g:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->c:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->i()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->h:Landroid/net/Uri;

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->getIconImageUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->s:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->j()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->i:Landroid/net/Uri;

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->getHiResImageUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->t:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->k()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->j:Landroid/net/Uri;

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->getFeaturedImageUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->u:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->l()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->k:Z

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->o()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->l:Z

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->m:Ljava/lang/String;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/games/GameEntity;->n:I

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->q()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/games/GameEntity;->o:I

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->r()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/games/GameEntity;->p:I

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->s()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->q:Z

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->t()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->r:Z

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->m()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->v:Z

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->n()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->w:Z

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->u()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->x:Z

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->v()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/GameEntity;->y:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->w()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->z:Z

    return-void
.end method

.method static synthetic A()Ljava/lang/Integer;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/games/GameEntity;->q_()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method static a(Lcom/google/android/gms/games/Game;)I
    .locals 3

    const/16 v0, 0x15

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->c()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->d()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->e()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->f()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->g()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->h()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->i()Landroid/net/Uri;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x7

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->j()Landroid/net/Uri;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x8

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->k()Landroid/net/Uri;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x9

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->l()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xa

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->o()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xb

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->p()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xc

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->q()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xd

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->r()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xe

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->s()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xf

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->t()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x10

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->m()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x11

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->n()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x12

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->u()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x13

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->v()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x14

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->w()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method static a(Lcom/google/android/gms/games/Game;Ljava/lang/Object;)Z
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    instance-of v0, p1, Lcom/google/android/gms/games/Game;

    if-nez v0, :cond_1

    move v1, v2

    :cond_0
    :goto_0
    return v1

    :cond_1
    if-eq p0, p1, :cond_0

    check-cast p1, Lcom/google/android/gms/games/Game;

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->f()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->g()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->g()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->h()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->i()Landroid/net/Uri;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->i()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->j()Landroid/net/Uri;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->j()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->k()Landroid/net/Uri;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->k()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->l()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->l()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->o()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->o()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->p()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->p()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->q()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->r()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->s()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->s()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->t()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->t()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->m()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->m()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->n()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->n()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->u()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->u()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->v()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->v()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/Game;->w()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->w()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    :cond_2
    move v1, v2

    goto/16 :goto_0

    :cond_3
    move v0, v2

    goto :goto_1
.end method

.method static synthetic a(Ljava/lang/Integer;)Z
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/GameEntity;->b(Ljava/lang/Integer;)Z

    move-result v0

    return v0
.end method

.method static b(Lcom/google/android/gms/games/Game;)Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "ApplicationId"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "DisplayName"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "PrimaryCategory"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "SecondaryCategory"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "Description"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "DeveloperName"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "IconImageUri"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->i()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "IconImageUrl"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getIconImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "HiResImageUri"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->j()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "HiResImageUrl"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getHiResImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "FeaturedImageUri"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->k()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "FeaturedImageUrl"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getFeaturedImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "PlayEnabledGame"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->l()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "InstanceInstalled"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->o()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "InstancePackageName"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->p()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "AchievementTotalCount"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->q()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "LeaderboardCount"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->r()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "RealTimeMultiplayerEnabled"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->s()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "TurnBasedMultiplayerEnabled"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->t()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "AreSnapshotsEnabled"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->u()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "ThemeColor"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->v()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "HasGamepadSupport"

    invoke-interface {p0}, Lcom/google/android/gms/games/Game;->w()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/GameEntity;->j_(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->z()Lcom/google/android/gms/games/Game;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/database/CharArrayBuffer;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->c:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/util/g;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V

    return-void
.end method

.method public b(Landroid/database/CharArrayBuffer;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->f:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/util/g;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V

    return-void
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c(Landroid/database/CharArrayBuffer;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->g:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/util/g;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->d:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {p0, p1}, Lcom/google/android/gms/games/GameEntity;->a(Lcom/google/android/gms/games/Game;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->e:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->f:Ljava/lang/String;

    return-object v0
.end method

.method public getFeaturedImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->u:Ljava/lang/String;

    return-object v0
.end method

.method public getHiResImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->t:Ljava/lang/String;

    return-object v0
.end method

.method public getIconImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->s:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->g:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/GameEntity;->a(Lcom/google/android/gms/games/Game;)I

    move-result v0

    return v0
.end method

.method public i()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->h:Landroid/net/Uri;

    return-object v0
.end method

.method public j()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->i:Landroid/net/Uri;

    return-object v0
.end method

.method public k()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->j:Landroid/net/Uri;

    return-object v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->k:Z

    return v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->v:Z

    return v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->w:Z

    return v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->l:Z

    return v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->m:Ljava/lang/String;

    return-object v0
.end method

.method public q()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/GameEntity;->o:I

    return v0
.end method

.method public r()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/GameEntity;->p:I

    return v0
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->q:Z

    return v0
.end method

.method public t()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->r:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/GameEntity;->b(Lcom/google/android/gms/games/Game;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->x:Z

    return v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->y:Ljava/lang/String;

    return-object v0
.end method

.method public w()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->z:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->r_()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/b;->a(Lcom/google/android/gms/games/GameEntity;Landroid/os/Parcel;I)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->h:Landroid/net/Uri;

    if-nez v0, :cond_1

    move-object v0, v1

    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->i:Landroid/net/Uri;

    if-nez v0, :cond_2

    move-object v0, v1

    :goto_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->j:Landroid/net/Uri;

    if-nez v0, :cond_3

    :goto_3
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->k:Z

    if-eqz v0, :cond_4

    move v0, v2

    :goto_4
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->l:Z

    if-eqz v0, :cond_5

    :goto_5
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->m:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/google/android/gms/games/GameEntity;->n:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/google/android/gms/games/GameEntity;->o:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/google/android/gms/games/GameEntity;->p:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->h:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->i:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->j:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_4
    move v0, v3

    goto :goto_4

    :cond_5
    move v2, v3

    goto :goto_5
.end method

.method public x()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/GameEntity;->a:I

    return v0
.end method

.method public y()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/GameEntity;->n:I

    return v0
.end method

.method public z()Lcom/google/android/gms/games/Game;
    .locals 0

    return-object p0
.end method
