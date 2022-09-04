.class public final Lcom/google/android/gms/games/achievement/AchievementEntity;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/games/achievement/Achievement;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/games/achievement/AchievementEntity;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final f:I

.field private final g:Ljava/lang/String;

.field private final h:I

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;

.field private final k:Landroid/net/Uri;

.field private final l:Ljava/lang/String;

.field private final m:Landroid/net/Uri;

.field private final n:Ljava/lang/String;

.field private final o:I

.field private final p:Ljava/lang/String;

.field private final q:Lcom/google/android/gms/games/PlayerEntity;

.field private final r:I

.field private final s:I

.field private final t:Ljava/lang/String;

.field private final u:J

.field private final v:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/achievement/b;

    invoke-direct {v0}, Lcom/google/android/gms/games/achievement/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/achievement/AchievementEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;ILjava/lang/String;Lcom/google/android/gms/games/PlayerEntity;IILjava/lang/String;JJ)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->f:I

    iput-object p2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->g:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->h:I

    iput-object p4, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->i:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->j:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->k:Landroid/net/Uri;

    iput-object p7, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->l:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->m:Landroid/net/Uri;

    iput-object p9, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->n:Ljava/lang/String;

    iput p10, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->o:I

    iput-object p11, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->p:Ljava/lang/String;

    iput-object p12, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->q:Lcom/google/android/gms/games/PlayerEntity;

    iput p13, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->r:I

    move/from16 v0, p14

    iput v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->s:I

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->t:Ljava/lang/String;

    move-wide/from16 v0, p16

    iput-wide v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->u:J

    move-wide/from16 v0, p18

    iput-wide v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->v:J

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/games/achievement/Achievement;)V
    .locals 5

    const/4 v4, 0x0

    const/4 v3, 0x1

    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput v3, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->f:I

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->g:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->d()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->h:I

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->i:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->j:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->g()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->k:Landroid/net/Uri;

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getUnlockedImageUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->l:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->h()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->m:Landroid/net/Uri;

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getRevealedImageUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->n:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->k()Lcom/google/android/gms/games/Player;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/games/Player;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/PlayerEntity;

    iput-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->q:Lcom/google/android/gms/games/PlayerEntity;

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->l()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->r:I

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->o()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->u:J

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->p()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->v:J

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->d()I

    move-result v0

    if-ne v0, v3, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->i()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->o:I

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->p:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->m()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->s:I

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->n()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->t:Ljava/lang/String;

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->g:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->j:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    iput v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->o:I

    iput-object v4, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->p:Ljava/lang/String;

    iput v2, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->s:I

    iput-object v4, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->t:Ljava/lang/String;

    goto :goto_0
.end method

.method static a(Lcom/google/android/gms/games/achievement/Achievement;)I
    .locals 6

    const/4 v5, 0x1

    const/4 v1, 0x0

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->d()I

    move-result v0

    if-ne v0, v5, :cond_0

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->m()I

    move-result v2

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->i()I

    move-result v0

    :goto_0
    const/16 v3, 0xa

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->c()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->e()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v5

    const/4 v1, 0x2

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->d()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    const/4 v1, 0x3

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->f()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    const/4 v1, 0x4

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->p()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v1

    const/4 v1, 0x5

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->l()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    const/4 v1, 0x6

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->o()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v1

    const/4 v1, 0x7

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->k()Lcom/google/android/gms/games/Player;

    move-result-object v4

    aput-object v4, v3, v1

    const/16 v1, 0x8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v3, v1

    const/16 v1, 0x9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v1

    invoke-static {v3}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0

    :cond_0
    move v0, v1

    move v2, v1

    goto :goto_0
.end method

.method static a(Lcom/google/android/gms/games/achievement/Achievement;Ljava/lang/Object;)Z
    .locals 8

    const/4 v3, 0x0

    const/4 v1, 0x1

    instance-of v0, p1, Lcom/google/android/gms/games/achievement/Achievement;

    if-nez v0, :cond_1

    move v1, v3

    :cond_0
    :goto_0
    return v1

    :cond_1
    if-eq p0, p1, :cond_0

    check-cast p1, Lcom/google/android/gms/games/achievement/Achievement;

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->d()I

    move-result v0

    if-ne v0, v1, :cond_3

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->m()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->i()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->i()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :goto_1
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->c()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->c()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->e()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->e()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->d()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->d()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->f()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->f()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->p()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->p()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->l()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->l()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->o()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->o()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->k()Lcom/google/android/gms/games/Player;

    move-result-object v4

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->k()Lcom/google/android/gms/games/Player;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    if-eqz v2, :cond_2

    if-nez v0, :cond_0

    :cond_2
    move v1, v3

    goto/16 :goto_0

    :cond_3
    move v0, v1

    move v2, v1

    goto/16 :goto_1
.end method

.method static b(Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "Id"

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "Type"

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "Name"

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "Description"

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "Player"

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->k()Lcom/google/android/gms/games/Player;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "State"

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->l()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->d()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const-string v1, "CurrentSteps"

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->m()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    const-string v1, "TotalSteps"

    invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->i()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->v()Lcom/google/android/gms/games/achievement/Achievement;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/database/CharArrayBuffer;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->i:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/util/g;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V

    return-void
.end method

.method public b(Landroid/database/CharArrayBuffer;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->j:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->g:Ljava/lang/String;

    return-object v0
.end method

.method public c(Landroid/database/CharArrayBuffer;)V
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->d()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->p:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/util/g;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->h:I

    return v0
.end method

.method public d(Landroid/database/CharArrayBuffer;)V
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->d()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->t:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/util/g;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->i:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {p0, p1}, Lcom/google/android/gms/games/achievement/AchievementEntity;->a(Lcom/google/android/gms/games/achievement/Achievement;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->j:Ljava/lang/String;

    return-object v0
.end method

.method public g()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->k:Landroid/net/Uri;

    return-object v0
.end method

.method public getRevealedImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->n:Ljava/lang/String;

    return-object v0
.end method

.method public getUnlockedImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->l:Ljava/lang/String;

    return-object v0
.end method

.method public h()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->m:Landroid/net/Uri;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->a(Lcom/google/android/gms/games/achievement/Achievement;)I

    move-result v0

    return v0
.end method

.method public i()I
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->d()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->a(Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->r()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public j()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->d()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->a(Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->s()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public k()Lcom/google/android/gms/games/Player;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->q:Lcom/google/android/gms/games/PlayerEntity;

    return-object v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->r:I

    return v0
.end method

.method public m()I
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->d()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->a(Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->t()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public n()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->d()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->a(Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->u()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public o()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->u:J

    return-wide v0
.end method

.method public p()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->v:J

    return-wide v0
.end method

.method public q()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->f:I

    return v0
.end method

.method public r()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->o:I

    return v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->p:Ljava/lang/String;

    return-object v0
.end method

.method public t()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->s:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->b(Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->t:Ljava/lang/String;

    return-object v0
.end method

.method public v()Lcom/google/android/gms/games/achievement/Achievement;
    .locals 0

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/achievement/b;->a(Lcom/google/android/gms/games/achievement/AchievementEntity;Landroid/os/Parcel;I)V

    return-void
.end method
