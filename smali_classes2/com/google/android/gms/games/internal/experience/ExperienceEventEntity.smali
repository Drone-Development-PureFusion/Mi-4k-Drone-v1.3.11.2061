.class public final Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/games/internal/experience/ExperienceEvent;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/games/internal/experience/b;


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/android/gms/games/GameEntity;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Landroid/net/Uri;

.field private final h:J

.field private final i:J

.field private final j:J

.field private final k:I

.field private final l:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/experience/b;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/experience/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->CREATOR:Lcom/google/android/gms/games/internal/experience/b;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Lcom/google/android/gms/games/GameEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;JJJII)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->a:I

    iput-object p2, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->c:Lcom/google/android/gms/games/GameEntity;

    iput-object p4, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->g:Landroid/net/Uri;

    iput-wide p8, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->h:J

    iput-wide p10, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->i:J

    iput-wide p12, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->j:J

    iput p14, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->k:I

    iput p15, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->l:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/games/internal/experience/ExperienceEvent;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->a:I

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->b:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/games/GameEntity;

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->d()Lcom/google/android/gms/games/Game;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/games/GameEntity;-><init>(Lcom/google/android/gms/games/Game;)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->c:Lcom/google/android/gms/games/GameEntity;

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->d:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->e:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->getIconImageUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->f:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->g()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->g:Landroid/net/Uri;

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->h()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->h:J

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->i()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->i:J

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->j()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->j:J

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->k()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->k:I

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->l()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->l:I

    return-void
.end method

.method static a(Lcom/google/android/gms/games/internal/experience/ExperienceEvent;)I
    .locals 4

    const/16 v0, 0xb

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->c()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->d()Lcom/google/android/gms/games/Game;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->e()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->f()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->getIconImageUrl()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->g()Landroid/net/Uri;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x7

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->i()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x8

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->j()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x9

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->k()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xa

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->l()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method static a(Lcom/google/android/gms/games/internal/experience/ExperienceEvent;Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    instance-of v2, p1, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;

    if-nez v2, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eq p0, p1, :cond_0

    check-cast p1, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->d()Lcom/google/android/gms/games/Game;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->d()Lcom/google/android/gms/games/Game;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->f()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->getIconImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->getIconImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->g()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->g()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->i()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->i()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->j()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->j()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->k()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->k()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->l()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->l()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    goto/16 :goto_0
.end method

.method static b(Lcom/google/android/gms/games/internal/experience/ExperienceEvent;)Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "ExperienceId"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "Game"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->d()Lcom/google/android/gms/games/Game;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "DisplayTitle"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "DisplayDescription"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "IconImageUrl"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->getIconImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "IconImageUri"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->g()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "CreatedTimestamp"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "XpEarned"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->i()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "CurrentXp"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->j()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "Type"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->k()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "NewLevel"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEvent;->l()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->n()Lcom/google/android/gms/games/internal/experience/ExperienceEvent;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lcom/google/android/gms/games/Game;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->c:Lcom/google/android/gms/games/GameEntity;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->d:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->e:Ljava/lang/String;

    return-object v0
.end method

.method public g()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->g:Landroid/net/Uri;

    return-object v0
.end method

.method public getIconImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->f:Ljava/lang/String;

    return-object v0
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->h:J

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

    iget-wide v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->i:J

    return-wide v0
.end method

.method public j()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->j:J

    return-wide v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->k:I

    return v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->l:I

    return v0
.end method

.method public m()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->a:I

    return v0
.end method

.method public n()Lcom/google/android/gms/games/internal/experience/ExperienceEvent;
    .locals 0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;->b(Lcom/google/android/gms/games/internal/experience/ExperienceEvent;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/internal/experience/b;->a(Lcom/google/android/gms/games/internal/experience/ExperienceEventEntity;Landroid/os/Parcel;I)V

    return-void
.end method
